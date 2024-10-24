pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "stud_proj"
include(":lab_1")
include(":stud_proj2")
include(":stud_proj22")
include(":myapplication")
include(":lab_3")
include(":lab_4")
include(":lab_2")
include(":lab_5")
include(":lab_6")
include(":lab_6_1")
include(":lab_7")
