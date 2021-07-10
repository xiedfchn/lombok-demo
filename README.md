# Lombok Demo
Project Lombok is a java library that helps reduce boilerplate code for java classes.

## @Getter and @Setter
You can annotate any field with @Getter and/or @Setter, to let lombok generate the default getter/setter automatically.
A default getter simply returns the field, and is named getFoo if the field is called foo. A default setter is named setFoo if the field is called foo, returns void, and takes 1 parameter of the same type as the field. It simply sets the field to this value.
