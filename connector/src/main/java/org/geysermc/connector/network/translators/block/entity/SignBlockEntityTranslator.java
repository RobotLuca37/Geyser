/*
 * Copyright (c) 2019 GeyserMC. http://geysermc.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 * @author GeyserMC
 * @link https://github.com/GeyserMC/Geyser
 */

package org.geysermc.connector.network.translators.block.entity;

import com.github.steveice10.mc.protocol.data.message.Message;
import com.github.steveice10.opennbt.tag.builtin.CompoundTag;
import com.nukkitx.nbt.CompoundTagBuilder;
import com.nukkitx.nbt.tag.ByteTag;
import com.nukkitx.nbt.tag.StringTag;
import com.nukkitx.nbt.tag.Tag;
import org.geysermc.connector.utils.MessageUtils;

import java.util.ArrayList;
import java.util.List;

public class SignBlockEntityTranslator extends BlockEntityTranslator {

    @Override
    public List<Tag<?>> translateTag(CompoundTag tag) {
        List<Tag<?>> tags = new ArrayList<>();

        String line1 = (String) tag.getValue().get("Text1").getValue();
        String line2 = (String) tag.getValue().get("Text2").getValue();
        String line3 = (String) tag.getValue().get("Text3").getValue();
        String line4 = (String) tag.getValue().get("Text4").getValue();

        tags.add(new StringTag("Text", MessageUtils.getBedrockMessage(Message.fromString(line1))
                + "\n" + MessageUtils.getBedrockMessage(Message.fromString(line2))
                + "\n" + MessageUtils.getBedrockMessage(Message.fromString(line3))
                + "\n" + MessageUtils.getBedrockMessage(Message.fromString(line4))
        ));

        tags.add(new ByteTag("isMovable", (byte) 0));
        return tags;
    }

    @Override
    public CompoundTag getDefaultJavaTag(int x, int y, int z) {
        CompoundTag tag = getConstantJavaTag("minecraft:sign", x, y, z);
        tag.put(new com.github.steveice10.opennbt.tag.builtin.StringTag("Text1", "\"text\":\"\""));
        tag.put(new com.github.steveice10.opennbt.tag.builtin.StringTag("Text2", "\"text\":\"\""));
        tag.put(new com.github.steveice10.opennbt.tag.builtin.StringTag("Text3", "\"text\":\"\""));
        tag.put(new com.github.steveice10.opennbt.tag.builtin.StringTag("Text4", "\"text\":\"\""));
        return tag;
    }

    @Override
    public com.nukkitx.nbt.tag.CompoundTag getDefaultBedrockTag(int x, int y, int z) {
        CompoundTagBuilder tagBuilder = getConstantBedrockTag("Sign", x, y, z).toBuilder();
        tagBuilder.stringTag("Text", "");
        tagBuilder.byteTag("isMovable", (byte) 0);
        return tagBuilder.buildRootTag();
    }
}
