import events.*

class BootStrap {
    
    
    def init = { servletContext ->
        
        def event = new Event(title: 'Your first event').save()

    }
    def destroy = {
    }
}
