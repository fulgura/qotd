//new qotd.Quote (author:"Chuck Norris", content:"Always uses hi sown design patterns").save()
//new qotd.Quote (author:"Larry Wall", content:"There is more than one method").save()
//new qotd.Quote (author:"Eric Reymond", content:"Being social").save()
println qotd.Quote.count()
def quote = qotd.Quote.findByAuthor("Chuck Norris")
println quote.content