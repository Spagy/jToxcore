/* OnMessageCallback.java
 *
 *  Copyright (C) 2013 Tox project All Rights Reserved.
 *
 *  This file is part of jToxcore
 *
 *  jToxcore is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  jToxcore is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with jToxcore.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package im.tox.jtoxcore.callbacks;

import im.tox.jtoxcore.ToxFriend;

/**
 * Callback class for receiving messages
 *
 * @author sonOfRa
 * @param <F>
 *            Friend type to use with the OnMessageCallback instance
 */
public interface OnMessageCallback<F extends ToxFriend> {

    /**
     * Method to be executed each time a message is received
     *
     * @param friend
     *            the friend who sent the message
     * @param message
     *            the message
     */
    void execute(F friend, String message);
}
