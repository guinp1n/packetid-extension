:hivemq-link: https://www.hivemq.com
:hivemq-extension-docs: {hivemq-link}/docs/extensions/latest/
:hivemq-mqtt-toolbox: {hivemq-link}/mqtt-toolbox
:hivemq-support: {hivemq-link}/support/
:hivemq-testcontainer: https://github.com/hivemq/hivemq-testcontainer
:hivemq-mqtt-client: https://github.com/hivemq/hivemq-mqtt-client

= HiveMQ 4 PacketId Extension

image:https://img.shields.io/badge/Extension_Type-Demonstration-orange?style=for-the-badge[Extension Type]
image:https://img.shields.io/github/v/release/hivemq/hivemq-hello-world-extension?style=for-the-badge[GitHub release (latest by date),link=https://github.com/hivemq/hivemq-hello-world-extension/releases/latest]
image:https://img.shields.io/github/license/hivemq/hivemq-hello-world-extension?style=for-the-badge&color=brightgreen[GitHub,link=LICENSE]
image:https://img.shields.io/github/actions/workflow/status/hivemq/hivemq-hello-world-extension/check.yml?branch=master&style=for-the-badge[GitHub Workflow Status,link=https://github.com/hivemq/hivemq-hello-world-extension/actions/workflows/check.yml?query=branch%3Amaster]

== Purpose

This PacketId extension registers a PublishInboundInterceptor to print the Packet Identifier of the PUBLISH packet to the log for debugging.

== Installation

. Clone this repository into a Java 11 Gradle project.
. Execute the Gradle task `hivemqExtensionZip` to build the extension.
. Move the file: `build/hivemq-extension/hivemq-hello-world-extension-4.30.0.zip` to the directory: `HIVEMQ_HOME/extensions`
. Unzip the file.
. Start HiveMQ.



== Need Help?

If you encounter any problems, we are happy to help.
The best place to get in contact is our {hivemq-support}[support^].


