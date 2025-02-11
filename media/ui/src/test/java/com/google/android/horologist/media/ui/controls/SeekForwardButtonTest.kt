/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.horologist.media.ui.controls

import com.google.android.horologist.media.ui.components.controls.SeekButtonIncrement
import com.google.android.horologist.media.ui.components.controls.SeekForwardButton
import com.google.android.horologist.screenshots.ScreenshotBaseTest
import org.junit.Test

class SeekForwardButtonTest : ScreenshotBaseTest() {

    @Test
    fun givenIncrementIsFive_thenIconIsFive() {
        screenshotTestRule.setContent(isComponent = true, takeScreenshot = true) {
            SeekForwardButton(
                onClick = {},
                seekButtonIncrement = SeekButtonIncrement.Five,
            )
        }
    }

    @Test
    fun givenIncrementIsTen_thenIconIsTen() {
        screenshotTestRule.setContent(isComponent = true, takeScreenshot = true) {
            SeekForwardButton(
                onClick = {},
                seekButtonIncrement = SeekButtonIncrement.Ten,
            )
        }
    }

    @Test
    fun givenIncrementIsThirty_thenIconIsThirty() {
        screenshotTestRule.setContent(isComponent = true, takeScreenshot = true) {
            SeekForwardButton(
                onClick = {},
                seekButtonIncrement = SeekButtonIncrement.Thirty,
            )
        }
    }

    @Test
    fun givenIncrementIsOtherValue_thenIconIsDefault() {
        screenshotTestRule.setContent(isComponent = true, takeScreenshot = true) {
            SeekForwardButton(
                onClick = {},
                seekButtonIncrement = SeekButtonIncrement.Known(15),
            )
        }
    }

    @Test
    fun givenIncrementIsUnknown_thenIconIsDefault() {
        screenshotTestRule.setContent(isComponent = true, takeScreenshot = true) {
            SeekForwardButton(
                onClick = {},
                seekButtonIncrement = SeekButtonIncrement.Unknown,
            )
        }
    }
}
