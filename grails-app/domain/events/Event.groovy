package events

class Event {

	String title

	Date dateCreated

    static constraints = {
    	title blank: false
    }
}
