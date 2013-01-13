import events.*

class BootStrap {
    
    
    def init = { servletContext ->

    	// add some dummy events
    	10.times { it ->
    		def event = new Event(title: "Event no. ${it+1}", dateCreated: new Date()-(10-it)).save()
    	}

    }
    def destroy = {
    }
}
