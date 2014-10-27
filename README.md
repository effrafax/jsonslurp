jsonslurp
=========

Test case for groovy jsonslurp error 

Running the tests:
groovy scripts/test.groovy

Additional classes in src folder:

FakeReader.groovy: Reader class that fills on some certain points not the complete char buffer

ProperFakeReader.groovy: Reader class that always fills the char buffer

PrintReaderOutput.groovy: Shows what characters are filled into the buffer during each read

