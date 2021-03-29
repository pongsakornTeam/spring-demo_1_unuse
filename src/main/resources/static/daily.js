Vue.component('dailyblogdate', {
    props: ['mounthShort', 'numDate'],
    template: '<div> <span class="time"> {{dateTime[0]}} </span> <p> <em><a href="index.html">The place holder</a></em> so you can see what the site would look like. This is just a place holder </p> </div>',
})

var vue1 = new Vue({
    el: "#daily-blog",
    data: {
        newDailyEvent: {
            numDate: '18',
            mounthShort: 'Dec',
            message: '',
        },
        dailyEvents: [
            {
                numDate: '18',
                mounthShort: 'Dec',
                message: 'TestPost1'
            }
        ]
    },
	created(){
		console.log('axios ::==',axios)
		this.fetchCities()
	},
    methods: {
		fetchCities(){
			axios
				.get('/list')
				.then( response =>{
					const {http , status ,data} = response
					this.dailyEvents = data;
				})
		},
		
        addEvent: function () {
			const { message , numDate} =  this.newDailyEvent
			axios
				.post('/save',{
						id : null,
						name : message,
						population : numDate
					})
				.then( response =>{
					//const {http , status ,data} = response
				})
        },
		deleteEvent: function(id){
			axios
				.post ('/delete',{
					id : id,
				}).then (response => {
					
				})
		},
		editEvent: function(){
			axios
				.post ('/edit',{
					
				}).then ( response => {
					
				})
		}
    }
})