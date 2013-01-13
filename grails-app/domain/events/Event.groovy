package events

class Event {

	String title

	Date created = new Date()

    static constraints = {
    	title blank: false
    }
}
