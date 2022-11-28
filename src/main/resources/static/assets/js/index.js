const app = Vue.createApp({
	data() {
		return {
			news: [],
		};
	},
	created() {
		axios.get("/api/news").then((response) => {
			this.news = response.data

			console.log(this.date);

		}).catch(function (error) { console.log(error); })
	},
	methods: {
		newDate(creationDate) {

			return new Date(creationDate).toLocaleString
				('es-AR', { hour: "numeric", minute: "numeric", day: "2-digit", month: "2-digit", hourCycle: 'h24' })
		}
	},
}).mount("#app");