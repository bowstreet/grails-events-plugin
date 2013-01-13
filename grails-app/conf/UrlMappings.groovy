class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/events"(controller:'eventAPI', action: 'list', parseRequest: true) {

		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
