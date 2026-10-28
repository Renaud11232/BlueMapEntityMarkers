rootProject.name = "bluemap-entity-markers"

subproject(":bluemap-entity-markers-common", "entity/common")
subproject(":bluemap-entity-markers-bukkit-common", "entity/bukkit-common")
subproject(":bluemap-entity-markers-fabric-common", "entity/fabric-common")
subproject(":bluemap-citizens-markers-bukkit", "citizens")
subproject(":bluemap-vehicle-markers-common", "vehicle/common")
subproject(":bluemap-vehicle-markers-bukkit", "vehicle/bukkit")
subproject(":bluemap-vehicle-markers-fabric", "vehicle/fabric")
subproject(":bluemap-mob-markers-common", "mob/common")
subproject(":bluemap-mob-markers-bukkit-common", "mob/bukkit-common")
subproject(":bluemap-mob-markers-spigot", "mob/spigot")
subproject(":bluemap-mob-markers-paper", "mob/paper")
subproject(":bluemap-mob-markers-fabric", "mob/fabric")
subproject(":bluemap-other-markers-common", "other/common")
subproject(":bluemap-other-markers-bukkit-common", "other/bukkit-common")
subproject(":bluemap-other-markers-spigot", "other/spigot")
subproject(":bluemap-other-markers-paper", "other/paper")
subproject(":bluemap-other-markers-fabric", "other/fabric")
subproject(":bluemap-entity-markers-icon-generator", "icon-generator")

fun subproject(name: String, path: String) {
    include(name)
    project(name).projectDir = file(path)
}