# reading-properties
This is an example of how to read properties with keys prefix or a set of related properties...

Have a look at the file "configuration.properties" which has properties of form:

a.b.x = something
a.b.y = something-else

p = something-different

Intention is to read all proeprties that start with a.b

And another case is to use:

relatedProperties = x=y,p=q 
