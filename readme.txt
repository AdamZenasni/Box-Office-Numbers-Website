To begin; after running the project access localhost:8443 as the security has been implemented and the TLS is blocking
the localhost 8080. Everything is avaliable on localhost: 8443 including the h2 database.

html: The HTML pages are all with the templates folder

css: The CSS file is named layout.css and is found in src/main/resources/static. It does not have its own dedicated
folder

validation behaviour: The validation behaviour is implemented within the register.htm which can be found within the
templates folder.

client-side js: The main Javascript can be found in src/main.resources/static and it is called main.js.

database writes: found within src/main/java/

database reads: Found under the /dao.

security: As explained the TLS is implemented within the application.properties and the security is implemented in
SecurityConfig wqhich can be under under /config