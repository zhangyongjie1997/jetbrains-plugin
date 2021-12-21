package com.github.zhangyongjie1997.jetbrainsplugin.services

import com.intellij.openapi.project.Project
import com.github.zhangyongjie1997.jetbrainsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
