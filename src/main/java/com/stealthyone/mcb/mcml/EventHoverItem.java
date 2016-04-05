/**
 * MCMarkupLanguage - Licensed under the MIT License (MIT)
 *
 * Copyright (c) Stealth2800 <http://stealthyone.com/>
 * Copyright (c) contributors <https://github.com/Stealth2800/MCMarkupLanguage>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.stealthyone.mcb.mcml;

import org.bukkit.inventory.ItemStack;

import mkremins.fanciful.FancyMessage;

final class EventHoverItem extends EventHover {

    Object item;

    EventHoverItem(MCMLBuilder builder, String input) {
        Object obj = builder.getReplacement(input);

        if (obj == null) {
            this.item = input;
        } else {
            this.item = obj;
        }
    }

    @Override
    void buildOn(FancyMessage message) {
        if (item instanceof ItemStack) {
            message.itemTooltip((ItemStack) item);
        } else {
            message.itemTooltip((String) item);
        }
    }

}