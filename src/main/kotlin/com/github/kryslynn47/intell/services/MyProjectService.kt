package com.github.kryslynn47.intell.services

import com.intellij.openapi.project.Project
import com.github.kryslynn47.intell.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
