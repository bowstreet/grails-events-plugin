import events.*

class BootStrap {
    
    
    def init = { servletContext ->

    	// add some dummy events
    	10.times { it ->
    		def event = new Event(title: "Event no. ${it+1}", created: new Date()-(10-it)).save()
    	}

    }
    def destroy = {
    }
}
