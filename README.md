# Grails Fields Plugin experiment

The point of this experiment is to gain some insight into how the
[Grails Fields Plugin](http://plugins.grails.org/plugin/grails/fields) 
works.

The Grails Fields Plugin documentation (stable version) is 
[here](http://grails-fields-plugin.github.io/grails-fields/latest/guide/index.html).

## Preparation

1. Create a domain class with a single String property.
2. Generate controller and views for this domain class.
3. Create field templates for propertyType 'string', which generate output 
   that identifies which template is invoked.

## Execution

Build and run the application, invoke each view (index, show, create, edit),
look at how the 'string' property is rendered in each case.
