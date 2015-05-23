/**
 * Author: Piotr Kordy (piotr.kordy@uni.lu <mailto:piotr.kordy@uni.lu>)
 * Date:   06/06/2013
 * Copyright (c) 2013,2012 University of Luxembourg -- Faculty of Science,
 *     Technology and Communication FSTC
 * All rights reserved.
 * Licensed under GNU Affero General Public License 3.0;
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU Affero General Public License as
 *    published by the Free Software Foundation, either version 3 of the
 *    License, or (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU Affero General Public License for more details.
 *
 *    You should have received a copy of the GNU Affero General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package lu.uni.adtool;

import java.awt.Color;
import java.awt.Font;

import lu.uni.adtool.adtree.ADTreeNode;

/**
 * Class to store program options.
 *
 * @author Piot Kordy
 * @version
 */
public final class Options
{
  /**
   * Indentation level when printing ADTerms.
   */
  public static Integer adt_indentLevel=6;

  /**
   * If true then ADTerm is pretty printed in many lines, otherwise it is
   * printed in one line.
   */
  public static boolean adt_multiLine=true;
  /**
   * The minimal gap between nodes.
   */
  public static int canv_gapBetweenNodes=20;
  /**
   * The height of the level when drawing a tree.
   */
  public static int canv_gapBetweenLevels=50;

  /**
   * Constructs a new instance.
   */
  public static enum ShapeType
  {
    RECTANGLE, OVAL, ROUNDRECT
  }
  public static ADTreeNode.RefinementType tree_defRefType = ADTreeNode.RefinementType.DISJUNCTIVE;
  public static Color     canv_BackgroundColor= Color.white;
  public static Color     canv_EdgesColor     = Color.black;
  public static Color     canv_TextColorAtt   = Color.black;
  public static Color     canv_TextColorDef   = Color.black;
  public static Color     canv_FillColorAtt   = Color.white;
  public static Color     canv_FillColorDef   = Color.white;
  public static Color     canv_BorderColorAtt = Color.green;
  public static Color     canv_BorderColorDef = Color.red;
  public static Color     canv_EditableColor  = new Color(255,255,155);
  public static ShapeType canv_ShapeAtt       = ShapeType.RECTANGLE;
  public static ShapeType canv_ShapeDef       = ShapeType.OVAL;
  public static Font      canv_Font           = new Font("SanSerif", Font.PLAIN, 12);
  public static Color     canv_MarkedColor    = new Color(184,207,229);//not saved in save file
  public static ADTreeNode.Type canv_Defender = ADTreeNode.Type.PROPONENT;
  /**
   * Arc size of round rectangle for node.
   */
  public static int       canv_ArcSize        = 10;
  /**
   * Arc padding for drawing arc to mark conjunctive nodes.
   */
  public static int       canv_ArcPadding     = 20;
  public static int       canv_LineWidth      = 2;
  public static boolean   canv_DoAntialiasing = true;
  public static final double    canv_scaleFactor    = 1.1;

  public static boolean      main_saveLayout = true;
  public static boolean      main_saveDomains = true;
  public static boolean      main_saveDerivedValues = true;

  /**
   * Print options
   */
  public static int print_noPages = 1;
  public static boolean print_perserveAspectRatio = true;
  public static boolean printview_showPageNumbers = true;
  public static Color   printview_background = new Color(144, 153, 174);
  public static Color   printview_border = Color.DARK_GRAY;
  public static Color   printview_shadow = Color.BLACK;
  public static Color   printview_paper = Color.WHITE;
  /**
   * save options
   */
  public static final Integer saveVersion = new Integer(2);
  public static int currentSaveVer= -1;
  /**
   * loggin options
   */
  public static int   log_noLinesSaved   = 1000;
//   public static boolean showAllLabels;
  private Options()
  {
  }
}
