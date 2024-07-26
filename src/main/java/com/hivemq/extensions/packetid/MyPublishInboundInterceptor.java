/*
 * Copyright 2018-present HiveMQ GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hivemq.extensions.packetid;

import com.hivemq.extension.sdk.api.annotations.NotNull;
import com.hivemq.extension.sdk.api.interceptor.publish.PublishInboundInterceptor;
import com.hivemq.extension.sdk.api.interceptor.publish.parameter.PublishInboundInput;
import com.hivemq.extension.sdk.api.interceptor.publish.parameter.PublishInboundOutput;
import com.hivemq.extension.sdk.api.packets.publish.ModifiablePublishPacket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is a very simple {@link PublishInboundInterceptor},
 * 1) it prints the PacketId to the log for debugging purpose.
 * 2) it adds an MQTT5 User Property debug-packet-id to the PUBLISH packet for debugging purpose.
 *
 * @author Dasha Samkova
 * @since 4.30.0
 */
public class MyPublishInboundInterceptor implements PublishInboundInterceptor {
    private static final @NotNull Logger log = LoggerFactory.getLogger(MyPublishInboundInterceptor.class);

    @Override
    public void onInboundPublish(
            final @NotNull PublishInboundInput publishInboundInput,
            final @NotNull PublishInboundOutput publishInboundOutput) {

        final ModifiablePublishPacket publishPacket = publishInboundOutput.getPublishPacket();
        //publishPacket.getUserProperties().addUserProperty("debug-packet-id", "" + publishPacket.getPacketId());
        log.info("Packet id {} received", publishPacket.getPacketId());
    }
}