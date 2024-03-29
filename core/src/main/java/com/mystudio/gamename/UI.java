/*******************************************************************************
 * Copyright 2020 Viridian Software Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.mystudio.gamename;

import org.mini2Dx.core.Graphics;

public class UI {
    private String lives;
    private String score;
    private String level;

    public UI(int lives, int score, int level) {
        set(lives,score,level);
    }

    public void set(int lives, int score, int level) {
        this.lives = "Lives Remaining: " + Integer.toString(lives);
        this.score = "Score: " + Integer.toString(score);
        this.level = "Level: " + Integer.toString(level);
    }

    public void render(Graphics g) {
        g.drawString(lives, 0,0);
        g.drawString(score, 250,0);
        g.drawString(level, 500,0);
    }

}
