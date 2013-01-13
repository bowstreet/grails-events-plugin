<div class="event">
	<ul class="event-attributes">
		<g:each in="${event.properties}" var="property">
			<li class="event-attribute-${property.key}">
				${property.value}
			</li>
		</g:each>
	</ul>
</div>