package events

class EventController {

	def scaffold = true

    def index() {
    	redirect action: 'list'
    }

    def test(Long id) {
    	
    }
}
