<ul class="event-list">
	<g:each in="${events}" var="event">
		<li>
			<events:get event="${event}" />
		</li>
	</g:each>
</ul>