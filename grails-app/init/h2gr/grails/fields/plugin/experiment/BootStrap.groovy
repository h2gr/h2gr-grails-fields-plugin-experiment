package h2gr.grails.fields.plugin.experiment

class BootStrap {

    def init = { servletContext ->
        new Person(name:'First Person').save(failOnError:true)
        new Person(name:'Second Person').save(failOnError:true)
        new Person(name:'Third Person').save(failOnError:true)
    }

    def destroy = {
    }

}
