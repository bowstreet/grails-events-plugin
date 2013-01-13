package events

class EventController {

	def scaffold = true

    def index() {
    	redirect action: 'list'
    }
}
