/**
 *    <one line to give the program's name and a brief idea of what it does.>
 *    Copyright (C) <year>  Marian Sievers
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.avancet.game.rougelike.helper;

import com.avancet.game.rougelike.GameWorld;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marian Sievers
 */
public class MapLoader {
    
    public static GameWorld getGameWorldFromFIle(String filename){
        GameWorld world = null;
        
        File mapFIle = new File("res/" + filename);
        
        if(!mapFIle.exists()){
            System.out.println("File does not exist");
            return null;
        }
        try {
            FileReader reader = new FileReader(mapFIle);
            BufferedReader buffer = new BufferedReader(reader);
            
            //Laden der Hoehe und Breite
            String zeile1 = buffer.readLine();
            String[] splitZ1 = zeile1.split(",");
            
            int height = Integer.parseInt(splitZ1[0].split(":")[1]);
            int width = Integer.parseInt(splitZ1[1].split(":")[1]);
            
            System.out.println("Height: " + height + ", Width: " + width);
            
            world = new GameWorld(width, height);
            
            //Laden der Map
            
            String next = null;
            
            while((next = buffer.readLine()) != null){
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MapLoader.class.getName()).log(Level.SEVERE, null, ex);
        } catch(IOException ex){
             Logger.getLogger(MapLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return world;
    }
    
}
