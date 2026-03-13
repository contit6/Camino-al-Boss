# Camino al Boss

Pantalla inicial estilo medieval para Android (Jetpack Compose), inspirada en la referencia enviada:

- Contenedor principal tipo pergamino centrado.
- Barra de vida del jefe con HP completo.
- Tarjeta central de pasos del día.
- Selector de día (Ayer/Hoy/Mañana) y barra de navegación inferior.

## Descargar y abrir en Android Studio

### Opción A: Descargar ZIP
1. En GitHub, presiona **Code > Download ZIP**.
2. Descomprimí la carpeta.
3. Abrí **Android Studio**.
4. Elegí **Open** y seleccioná la carpeta `Camino-al-Boss`.
5. Esperá a que termine el **Gradle Sync**.

### Opción B: Clonar con Git
```bash
git clone <URL_DEL_REPO>
cd Camino-al-Boss
```
Luego abrí esa carpeta en Android Studio con **Open**.

## Requisitos

- Android Studio (Koala o superior recomendado).
- JDK 17 (normalmente ya incluido en Android Studio).
- Android SDK instalado desde **SDK Manager**.

## Ejecutar en un emulador o celular

1. En Android Studio, dejá que termine el sync.
2. Si falta SDK:
   - Ir a **Tools > SDK Manager**.
   - Instalar al menos **Android 14 (API 34)**.
3. Elegir dispositivo (emulador o celular con depuración USB).
4. Presionar **Run 'app'** (botón ▶️).

## Build por consola (opcional)

Si querés compilar por terminal:

```bash
./gradlew :app:assembleDebug
```

Si te aparece error de SDK, creá `local.properties` en la raíz del proyecto con:

```properties
sdk.dir=/ruta/a/tu/Android/Sdk
```

Ejemplos típicos:
- Linux: `/home/tu_usuario/Android/Sdk`
- macOS: `/Users/tu_usuario/Library/Android/sdk`
- Windows: `C:\\Users\\tu_usuario\\AppData\\Local\\Android\\Sdk`
