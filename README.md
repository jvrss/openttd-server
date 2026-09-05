[![Build OpenTTD Server](https://github.com/jvrss/openttd-server/actions/workflows/build.yml/badge.svg)](https://github.com/jvrss/openttd-server/actions/workflows/build.yml)
[![Release OpenTTD Server](https://github.com/jvrss/openttd-server/actions/workflows/release.yml/badge.svg)](https://github.com/jvrss/openttd-server/actions/workflows/release.yml)  
[![Docker Pulls](https://badgen.net/docker/pulls/soldierjvx/openttd-server?icon=docker&label=pulls)](https://hub.docker.com/r/soldierjvx/openttd-server/)
[![Docker Stars](https://badgen.net/docker/stars/soldierjvx/openttd-server?icon=docker&label=stars)](https://hub.docker.com/r/soldierjvx/openttd-server/)
[![Docker Image Size](https://badgen.net/docker/size/soldierjvx/openttd-server?icon=docker&label=image%20size)](https://hub.docker.com/r/soldierjvx/openttd-server/)
![Github stars](https://badgen.net/github/stars/jvrss/openttd-server?icon=github&label=stars)
![Github forks](https://badgen.net/github/forks/jvrss/openttd-server?icon=github&label=forks)
![Github issues](https://img.shields.io/github/issues/jvrss/openttd-server)
![Github last-commit](https://img.shields.io/github/last-commit/jvrss/openttd-server)

# Welcome to OpenTTD Server
This Docker container allows you to host multiple instances of OpenTTD (https://www.openttd.org) dedicated servers in a single container, providing an efficient and convenient environment for hosting these servers.

Forked from: https://github.com/andreashauschild/openttd-server

## Improvements:
 - Backend and frontend are updated to the latest versions.
 - Now, when the Docker container is stopped for any reason, the next time it is started, the servers that were running before it stopped will automatically start running again.
 - Admin portal bug fixed


This documentation expect a basic knowledge of docker (expose ports and volumes).

The current state of this Project is `BETA`. Hosting works and every function was tested but as you know a developer should not test his own software. Please create an issue if something needs to be fixed.

It provides the following features:

- Login protected admin gui
- Managing multiple dedicated OpenTTD server instance. You just need to expose the needed ports on container startup.
- Upload/Download of save games and configuration files
- Password protection for dedicated servers
- Auto save of running servers
- Auto pause and unpause on inactive servers. If no player is playing the server is running but paused. Server unpauses if a player joins a company.
- Simple terminal to send commands directly to the dedicated server

# Frontend

Server front:
https://github.com/jvrss/openttd-server-ui

# Versions
The following table shows which docker image contains which OpenTTD version. For now, I will only support final versions (no beta).

| Container                        | OpenTTD |
|----------------------------------|--------|
| soldierjvx/openttd-server:latest  | 15.3   |
| soldierjvx/openttd-server:v15.3.0 | 15.3   |


# Screenshots

### Server Management
<a href="docs/images/server-overview.JPG">
<img src="docs/images/server-overview.JPG"/>
</a>

### Dedicated Server Settings
<a href="docs/images/server_configuration.JPG">
<img src="docs/images/server_configuration.JPG"/>
</a>

### Terminal
<a href="docs/images/server-terminal.JPG">
<img src="docs/images/server-terminal.JPG"/>
</a>

### File Upload
<a href="docs/images/file_upload.JPG">
<img src="docs/images/file_upload.JPG"/>
</a>

### File Explorer for server customization like NewGRF etc.
<a href="docs/images/openttd-fileexplorer.gif">
<img src="docs/images/openttd-fileexplorer.gif"/>
</a>

### Admin Login
<a href="docs/images/admin-login.JPG">
<img src="docs/images/admin-login.JPG"/>
</a>

### File Explorer
The File Explorer allows you to customize your OpenTTD installation at runtime by uploading custom content directly through the web interface. This feature was added based on [Issue #4](https://github.com/andreashauschild/openttd-server/issues/4).

#### Use Cases
- Upload **NewGRF** files to add new graphics, vehicles, industries, or town names
- Add **AI scripts** and **Game Scripts** to enhance gameplay
- Upload **Base Graphics Sets** for custom visual styles
- Manage configuration files and save games

#### How It Works
The File Explorer provides access to the OpenTTD installation directory (`/home/openttd/openttd-<version>`). You can:
- **Browse** the complete directory structure
- **Upload** files to any directory (e.g., `newgrf/`, `ai/`, `game/`)
- **Create** new directories for organizing content
- **Delete** files and directories
- **Download** files or entire directories as ZIP archives
- **Move/Copy** files between directories
- **Rename** files and directories

#### Example: Adding a NewGRF
1. Download the NewGRF using one of these methods:
   - **Via OpenTTD App:** Use the in-game content downloader. Files are saved to your local `content_download/newgrf` folder. See [OpenTTD Wiki](https://wiki.openttd.org/en/Manual/NewGRF#manual-install) for directory locations on your OS.
   - **Manual Download:** Get `.grf` files from [BaNaNaS](https://bananas.openttd.org/) or [GRFCrawler](https://grfcrawler.tt-forums.net/)
2. Open the File Explorer in the web interface
3. Navigate to the `newgrf/` directory
4. Upload the `.grf` file
5. Configure your server's `openttd.cfg` to use the NewGRF or create a save game that includes it

**Note:** NewGRF files should be installed before starting a new game to ensure correct operation. Changes to NewGRF settings are baked into save games.

# Networking
The project now includes a `docker-compose.yml` file to simplify network configuration. You can use the `docker-compose up -d` command to start the container with the appropriate network configuration. \
Link to the file: [docker-compose.yml](https://github.com/jvrss/openttd-server/blob/main/src/main/docker/docker-compose.yaml) \
The frontend will run on port 4200 and the backend on port 8080. You can access the frontend at http://localhost:4200 and the backend at http://localhost:8080. \
The OpenTTD dedicated server runs on port 3979. You can change this port in the docker-compose.yaml file if you wish. \
And if you want to run more than one OpenTTD dedicated server, you’ll need to expose additional ports. For example, if you want to run 20 OpenTTD dedicated servers, you’ll need to expose ports 3979 through 3999.

# File Locations
All data and uploads within the container are saved in the `/home/openttd/server` directory.
OpenTTD is installed on `/home/openttd/openttd-<version>` directory.

# Setup
When you start the Docker container for the OpenTTD server for the first time, it will log the password for the admin login. See fragment below.
You can use the admin user to log in to the web app, which runs on http://localhost:4200 by default.
Once logged in, you can access the web app's settings to change the admin password.

**First startup log fragment with password**
```
...
###########################################################################
### No initial password was set. A password for 'admin' will be generated.
### Copy it NOW, because it will never be shown again.
### Password: W!318Y-yBb
###########################################################################
...
```

## License

This project is licensed under the Apache License 2.0. See the LICENSE file for details.