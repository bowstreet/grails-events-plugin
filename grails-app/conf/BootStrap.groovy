import events.*

class BootStrap {
    
    
    def init = { servletContext ->

    	10.times { it ->
    		println it
    		def event = new Event(title: "Event no. ${it+1}", dateCreated: new Date()-(10-it)).save()
    	}

    }
    def destroy = {
    }
}
