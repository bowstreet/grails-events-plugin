grails-events-plugin
====================

A simple plugin to manage a stream of events in your application.

## Provided Artefacts
The plugin provides a simple domain class `Event` which you can use to model your special kind of events from (or simply use it if you need nothing more).

The plugin also provides the `events`-Taglib which you can use to include parts of the stream in your views.

## Events-Taglib

The taglib provides to simple methods: An action to render a single event and a list action.
The generated code for each event is structured like this
```HTML
<div class="event">
	<ul class="event-attributes">
			<li class="event-attribute-${propertyName}">
				${propertyValue}
			</li>
	</ul>
</div>
```