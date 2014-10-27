import groovy.json.JsonSlurper

def out = new PrintReaderOutput()

println "  Reader that returns always buffer size "
println "========================================="
reader = new ProperFakeReader()
out.print(reader)
reader = new ProperFakeReader()
def parser = new JsonSlurper();
assert parser.parse(reader)!=null


println "  Reader with read chars < buffer size   "
println "========================================="

def reader = new FakeReader()
out.print(reader)

reader = new FakeReader()
parser = new JsonSlurper();
assert parser.parse(reader)!=null


