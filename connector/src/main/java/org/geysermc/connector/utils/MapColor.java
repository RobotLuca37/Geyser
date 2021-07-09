/*
 * Copyright (c) 2019-2021 GeyserMC. http://geysermc.org
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

package org.geysermc.connector.utils;

public enum MapColor {
    COLOR_0(-1, -1, -1),
    COLOR_1(-1, -1, -1),
    COLOR_2(-1, -1, -1),
    COLOR_3(-1, -1, -1),
    COLOR_4(90, 126, 40),
    COLOR_5(110, 154, 48),
    COLOR_6(127, 178, 56),
    COLOR_7(67, 94, 30),
    COLOR_8(174, 164, 115),
    COLOR_9(213, 201, 141),
    COLOR_10(247, 233, 163),
    COLOR_11(131, 123, 86),
    COLOR_12(140, 140, 140),
    COLOR_13(172, 172, 172),
    COLOR_14(199, 199, 199),
    COLOR_15(105, 105, 105),
    COLOR_16(180, 0, 0),
    COLOR_17(220, 0, 0),
    COLOR_18(255, 0, 0),
    COLOR_19(135, 0, 0),
    COLOR_20(113, 113, 180),
    COLOR_21(138, 138, 220),
    COLOR_22(160, 160, 255),
    COLOR_23(85, 85, 135),
    COLOR_24(118, 118, 118),
    COLOR_25(144, 144, 144),
    COLOR_26(167, 167, 167),
    COLOR_27(88, 88, 88),
    COLOR_28(0, 88, 0),
    COLOR_29(0, 107, 0),
    COLOR_30(0, 124, 0),
    COLOR_31(0, 66, 0),
    COLOR_32(180, 180, 180),
    COLOR_33(220, 220, 220),
    COLOR_34(255, 255, 255),
    COLOR_35(135, 135, 135),
    COLOR_36(116, 119, 130),
    COLOR_37(141, 145, 159),
    COLOR_38(164, 168, 184),
    COLOR_39(87, 89, 97),
    COLOR_40(107, 77, 54),
    COLOR_41(130, 94, 66),
    COLOR_42(151, 109, 77),
    COLOR_43(80, 58, 41),
    COLOR_44(79, 79, 79),
    COLOR_45(97, 97, 97),
    COLOR_46(112, 112, 112),
    COLOR_47(59, 59, 59),
    COLOR_48(45, 45, 180),
    COLOR_49(55, 55, 220),
    COLOR_50(64, 64, 255),
    COLOR_51(34, 34, 135),
    COLOR_52(101, 84, 51),
    COLOR_53(123, 103, 62),
    COLOR_54(143, 119, 72),
    COLOR_55(76, 63, 38),
    COLOR_56(180, 178, 173),
    COLOR_57(220, 217, 211),
    COLOR_58(255, 252, 245),
    COLOR_59(135, 133, 130),
    COLOR_60(152, 90, 36),
    COLOR_61(186, 110, 44),
    COLOR_62(216, 127, 51),
    COLOR_63(114, 67, 27),
    COLOR_64(126, 54, 152),
    COLOR_65(154, 66, 186),
    COLOR_66(178, 76, 216),
    COLOR_67(94, 40, 114),
    COLOR_68(72, 108, 152),
    COLOR_69(88, 132, 186),
    COLOR_70(102, 153, 216),
    COLOR_71(54, 81, 114),
    COLOR_72(162, 162, 36),
    COLOR_73(198, 198, 44),
    COLOR_74(229, 229, 51),
    COLOR_75(121, 121, 27),
    COLOR_76(90, 144, 18),
    COLOR_77(110, 176, 22),
    COLOR_78(127, 204, 25),
    COLOR_79(67, 108, 13),
    COLOR_80(171, 90, 116),
    COLOR_81(209, 110, 142),
    COLOR_82(242, 127, 165),
    COLOR_83(128, 67, 87),
    COLOR_84(54, 54, 54),
    COLOR_85(66, 66, 66),
    COLOR_86(76, 76, 76),
    COLOR_87(40, 40, 40),
    COLOR_88(108, 108, 108),
    COLOR_89(132, 132, 132),
    COLOR_90(153, 153, 153),
    COLOR_91(81, 81, 81),
    COLOR_92(54, 90, 108),
    COLOR_93(66, 110, 132),
    COLOR_94(76, 127, 153),
    COLOR_95(40, 67, 81),
    COLOR_96(90, 44, 126),
    COLOR_97(110, 54, 154),
    COLOR_98(127, 63, 178),
    COLOR_99(67, 33, 94),
    COLOR_100(36, 54, 126),
    COLOR_101(44, 66, 154),
    COLOR_102(51, 76, 178),
    COLOR_103(27, 40, 94),
    COLOR_104(72, 54, 36),
    COLOR_105(88, 66, 44),
    COLOR_106(102, 76, 51),
    COLOR_107(54, 40, 27),
    COLOR_108(72, 90, 36),
    COLOR_109(88, 110, 44),
    COLOR_110(102, 127, 51),
    COLOR_111(54, 67, 27),
    COLOR_112(108, 36, 36),
    COLOR_113(132, 44, 44),
    COLOR_114(153, 51, 51),
    COLOR_115(81, 27, 27),
    COLOR_116(18, 18, 18),
    COLOR_117(22, 22, 22),
    COLOR_118(25, 25, 25),
    COLOR_119(13, 13, 13),
    COLOR_120(176, 168, 54),
    COLOR_121(216, 205, 66),
    COLOR_122(250, 238, 77),
    COLOR_123(132, 126, 41),
    COLOR_124(65, 155, 150),
    COLOR_125(79, 189, 184),
    COLOR_126(92, 219, 213),
    COLOR_127(49, 116, 113),
    COLOR_128(52, 90, 180),
    COLOR_129(64, 110, 220),
    COLOR_130(74, 128, 255),
    COLOR_131(39, 68, 135),
    COLOR_132(0, 153, 41),
    COLOR_133(0, 187, 50),
    COLOR_134(0, 217, 58),
    COLOR_135(0, 115, 31),
    COLOR_136(91, 61, 35),
    COLOR_137(111, 74, 42),
    COLOR_138(129, 86, 49),
    COLOR_139(68, 46, 26),
    COLOR_140(79, 1, 0),
    COLOR_141(97, 2, 0),
    COLOR_142(112, 2, 0),
    COLOR_143(59, 1, 0),
    COLOR_144(148, 125, 114),
    COLOR_145(180, 153, 139),
    COLOR_146(209, 177, 161),
    COLOR_147(111, 94, 85),
    COLOR_148(112, 58, 25),
    COLOR_149(137, 71, 31),
    COLOR_150(159, 82, 36),
    COLOR_151(84, 43, 19),
    COLOR_152(105, 61, 76),
    COLOR_153(129, 75, 93),
    COLOR_154(149, 87, 108),
    COLOR_155(79, 46, 57),
    COLOR_156(79, 76, 97),
    COLOR_157(97, 93, 119),
    COLOR_158(112, 108, 138),
    COLOR_159(59, 57, 73),
    COLOR_160(131, 94, 25),
    COLOR_161(160, 115, 31),
    COLOR_162(186, 133, 36),
    COLOR_163(98, 70, 19),
    COLOR_164(73, 83, 37),
    COLOR_165(89, 101, 46),
    COLOR_166(103, 117, 53),
    COLOR_167(55, 62, 28),
    COLOR_168(113, 54, 55),
    COLOR_169(138, 66, 67),
    COLOR_170(160, 77, 78),
    COLOR_171(85, 41, 41),
    COLOR_172(40, 29, 25),
    COLOR_173(49, 35, 30),
    COLOR_174(57, 41, 35),
    COLOR_175(30, 22, 19),
    COLOR_176(95, 76, 69),
    COLOR_177(116, 92, 85),
    COLOR_178(135, 107, 98),
    COLOR_179(71, 57, 52),
    COLOR_180(61, 65, 65),
    COLOR_181(75, 79, 79),
    COLOR_182(87, 92, 92),
    COLOR_183(46, 49, 49),
    COLOR_184(86, 52, 62),
    COLOR_185(105, 63, 76),
    COLOR_186(122, 73, 88),
    COLOR_187(65, 39, 47),
    COLOR_188(54, 44, 65),
    COLOR_189(66, 53, 79),
    COLOR_190(76, 62, 92),
    COLOR_191(40, 33, 49),
    COLOR_192(54, 35, 25),
    COLOR_193(66, 43, 30),
    COLOR_194(76, 50, 35),
    COLOR_195(40, 26, 19),
    COLOR_196(54, 58, 30),
    COLOR_197(66, 71, 36),
    COLOR_198(76, 82, 42),
    COLOR_199(40, 43, 22),
    COLOR_200(100, 42, 32),
    COLOR_201(123, 52, 40),
    COLOR_202(142, 60, 46),
    COLOR_203(75, 32, 24),
    COLOR_204(26, 16, 11),
    COLOR_205(32, 19, 14),
    COLOR_206(37, 22, 16),
    COLOR_207(20, 12, 8),
    COLOR_208(133, 34, 35),
    COLOR_209(163, 41, 42),
    COLOR_210(189, 48, 49),
    COLOR_211(100, 25, 26),
    COLOR_212(104, 44, 68),
    COLOR_213(128, 54, 84),
    COLOR_214(148, 63, 97),
    COLOR_215(78, 33, 51),
    COLOR_216(65, 18, 20),
    COLOR_217(79, 22, 25),
    COLOR_218(92, 25, 29),
    COLOR_219(49, 13, 15),
    COLOR_220(16, 89, 95),
    COLOR_221(19, 109, 116),
    COLOR_222(22, 126, 134),
    COLOR_223(12, 67, 71),
    COLOR_224(41, 100, 99),
    COLOR_225(50, 123, 121),
    COLOR_226(58, 142, 140),
    COLOR_227(31, 75, 74),
    COLOR_228(61, 31, 44),
    COLOR_229(74, 38, 53),
    COLOR_230(86, 44, 62),
    COLOR_231(46, 23, 33),
    COLOR_232(14, 127, 94),
    COLOR_233(17, 155, 115),
    COLOR_234(20, 180, 133),
    COLOR_235(11, 95, 70);

    private static final MapColor[] VALUES = values();

    private final int red;
    private final int green;
    private final int blue;

    MapColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public static MapColor fromId(int id) {
        return id >= 0 && id < VALUES.length ? VALUES[id] : COLOR_0;
    }

    public int toABGR() {
        int alpha = 255;
        if (red == -1 && green == -1 && blue == -1)
            alpha = 0; // transparent

        return ((alpha & 0xFF) << 24) |
               ((blue & 0xFF) << 16) |
               ((green & 0xFF) << 8) |
               (red & 0xFF);
    }
}