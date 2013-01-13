package events

class EventsTagLib {

	static namespace = "events"

	def get = { attrs ->
		// render an event from a given id

		def event = attrs.event ? attrs.event : Event.get(attrs.id?.toLong())

		if (!event) {
			log.warn "No event found with id ${attrs.id}"
			return
		}

		out << render(template: '/event/getTemplate', model: [event: event])
	}

	def list = { attrs ->

		def events = attrs.events

		if (!events) {
			log.warn "No events given!"
			return
		}

		out << render(template: '/event/listTemplate', model: [events: events])

	}

}
