/*
 * Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod.
 * Copyright (C) 2016  Datenverteiler <https://github.com/datenverteiler>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.pkg;

import de.bsvrz.dav.daf.main.*;
import de.bsvrz.sys.funclib.application.*;
import de.bsvrz.sys.funclib.commandLineArgs.*;

/**
 * Applikation.
 *
 * @author Datenverteiler, Falko Schumann
 */
public class Applikation implements StandardApplication {

    public static void main(String args[]) {
        StandardApplicationRunner.run(new Applikation(), args);
    }

    public void parseArguments(ArgumentList argumentList) throws Exception {
        // TODO
    }

    public void initialize(ClientDavInterface connection) throws Exception {
        // TODO

        System.out.println("Hallo Datenverteiler!");
    }

}
