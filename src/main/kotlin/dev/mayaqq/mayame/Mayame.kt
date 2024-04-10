package dev.mayaqq.mayame

import org.gradle.api.Plugin
import org.gradle.api.Project

class Mayame : Plugin<Project> {
    override fun apply(target: Project) {
        val updateDescriptions = target.tasks.register("updateDescriptions") {
            it.group = "publishing"
        }
    }
}