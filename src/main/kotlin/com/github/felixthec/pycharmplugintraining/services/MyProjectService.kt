package com.github.felixthec.pycharmplugintraining.services

import com.intellij.openapi.project.Project
import com.github.felixthec.pycharmplugintraining.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
