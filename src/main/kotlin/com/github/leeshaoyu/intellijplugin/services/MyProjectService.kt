package com.github.leeshaoyu.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.leeshaoyu.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
