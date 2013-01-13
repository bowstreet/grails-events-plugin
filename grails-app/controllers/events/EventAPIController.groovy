package events

import grails.converters.*

class EventAPIController {

    def list(Long start, Long end) {

    	def startDate, endDate

    	if (start) {
    		startDate = new Date(start)
    	}
    	if (end) {
    		endDate = new Date(end)
    	}

    	def c = Event.createCriteria()
    	def results = c.list {
            and {
        		if (startDate) {
        			ge 'created', startDate
        		}
        		if (endDate) {
        			le 'created', endDate
        		}
            }
    	}

        println "start: ${startDate}"
        println "end:   ${endDate}"

    	render results as JSON

    }
}
