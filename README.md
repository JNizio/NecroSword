# Necro Sword — Minecraft Forge 1.7.10

A small Forge 1.7.10 mod adding the **Necro Sword**.

## Features

- Necro Sword in the Combat creative tab
- 1800 durability
- 8 base melee damage
- +4 bonus necrotic damage on melee hit
- Dark vanilla smoke + large-smoke particles erupt around struck enemies
- Native 16x16 Minecraft 1.7.10 item texture

## Target

- Minecraft 1.7.10
- Forge 10.13.4.1614
- Java 8
- anatawa12 ForgeGradle 1.2 fork

## Building

GitHub Actions builds the mod automatically on pushes to `main`.

For a local build with Java 8, install Gradle 7.4.2 and run:

```bash
gradle SetupCIWorkspace build
```

The compiled mod is:

`build/libs/NecroSword-1.7.10-1.0.0.jar`

The repository stores the tiny PNG as Base64 text because the connected repository writer is text-oriented. The Gradle `generateTexture` task reconstructs `necro_sword.png` before `processResources`, so the final JAR contains a normal Minecraft texture at `assets/necrosword/textures/items/necro_sword.png`.
