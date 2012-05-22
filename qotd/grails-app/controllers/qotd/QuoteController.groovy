package qotd

class QuoteController {

	def scaffold = true
	
    def index = { 
		redirect(action:home)
    }
    
    def home = {
		render "<h1>Real programmers!</h1>"
    }	
    def random = {

    	def staticQuote = new Quote (author:"Chuck Norris", content:"Always uses hi sown design patterns")
		[quote:staticQuote]
	}
}
