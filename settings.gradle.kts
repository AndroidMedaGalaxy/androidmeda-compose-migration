pluginManagement {
    repositories {
        google()
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

rootProject.name = "androidmeda-compose-migration"

include(":core:data")
include(":core:design")
include(":app-legacy")
include(":app-hybrid")
include(":app-compose")
