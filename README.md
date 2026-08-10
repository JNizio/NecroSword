# Necro Sword — Minecraft Forge 1.7.10

A small Forge 1.7.10 mod adding the **Necro Sword**.

## Features

- Necro Sword in the Combat creative tab
- 1800 durability
- 8 base melee damage
- +4 bonus necrotic damage on melee hit
- Dark smoke burst around struck enemies
- Native 1.7.10 16x16 item texture

## Target

- Minecraft 1.7.10
- Forge 10.13.4.1614
- Java 8
- anatawa12 ForgeGradle 1.2 fork

## Build

The GitHub Actions workflow builds the mod automatically on pushes to `main` and uploads the compiled JAR from `build/libs`.

Local build (Java 8):

```bash
./gradlew SetupCIWorkspace build
```

Expected release jar:

`build/libs/NecroSword-1.7.10-1.0.0.jar`
