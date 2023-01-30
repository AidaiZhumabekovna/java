package oop.constructor;

import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        System.out.println("Цифровая психология");
        System.err.println("Число сознания – это дата рождения человека. Пожалуйста, пишите вашу дату рождения");
        Scanner scan = new Scanner(System.in);
        int numcon = scan.nextInt();

        if(numcon == 1 || numcon == 10 || numcon == 19 || numcon == 28) {
            System.out.println("Те, у кого число сознания 1, т.е. рожденные 1, 10, 19 или 28 числа, \nимеют серьезные задатки лидера. Они хотят быть на виду, стремятся к власти. \nЯрким примером такой личности являются Борис Николаевич Ельцин (родился 1 февраля) и Леонид Ильич Брежнев (родился 19 декабря).\n Люди с таким числом сознания отлично реализуют себя на руководящих позициях и склонны вести собственный бизнес.\n" +
                    "\n" +
                    "Если человек находится в негативном состоянии, он становится конфликтным, ему трудно \n найти общий язык с людьми и идти на компромисс, пропадает взаимопонимание, а эгоизм берет верх над ситуацией.\n" +
                    "\n" +
                    "Женщины с числом сознания 1 могут заключить успешный брак с таким же обладателем единицы. \n Согласно цифрологии, такие представительницы прекрасного пола могут быть целительницами, особенно это касается тех, кто родился 19 числа");
        } if(numcon == 2 || numcon == 11 || numcon == 20 || numcon == 29) {
            System.out.println("Обладатели двойки считаются прекрасными психологами, т.к. они всегда стараются \nпонимать других людей, чувствуют своего партнера и легко находят со всеми общий язык. Они не могут жить \nв одиночестве, это прирожденные дипломаты и министры. Такие люди могут быть эзотериками, \nа те, кто рожден 29 числа, обладают даром гипноза. Но стоит отметить, что рожденные 11 числа, отличаются от остальных \n носителей двоек и могут содержать в себе энергии числа 1 и 2. Представители числа 2 часто сомневаются, \nи если они не реализуют свою энергию, то могут уйти в депрессию ");
        } if (numcon == 3 || numcon == 12 || numcon == 21|| numcon == 30) {
            System.out.println("«Тройки» (рожденные 3, 12, 21, 30 числа) живут под девизом «Я знаю!» С ними сложно \nвести диалог, ведь они всегда считают себя правыми. Но это не говорит о том, что быть «тройкой» плохо.\n Если правильно направить свою энергию, можно стать наставником, гуру или врачом. \nОни стремятся к управлению, любят системность в делах. К духовным практикам такие личности обращаются только в серьезные моменты своей жизни. \n Их главный ключ к успеху – научиться понимать окружающих");
        } if (numcon == 4 || numcon == 13 || numcon == 22|| numcon == 31){
            System.out.println("«Четверки» (те, кто родился 3, 13, 22 и 31 числа) – это очень креативные люди, \nкоторые охотно берутся за реализацию самых смелых идей. Они постоянно борются за справедливость и привыкли \nбольше отдавать, чем получать. В негативном состоянии представители этого числа \nсознания часто впадают в апатию и направляют свой креатив на осуществление различных мошеннических схем ");
        } if (numcon == 5 || numcon == 14 || numcon == 23){
            System.out.println("Люди, рожденные 5, 14 и 23 числа, привыкли опираться на логику при принятии решений, \nимеют высокий интеллект, легко подстраиваются под любого собеседника и часто становятся успешными в бизнесе. \nИм важен конкретный результат, они имеют склонность к масштабированию, \nпоэтому могут часто менять жен, а в деловой сфере предпочитают иметь сетевой бизнес и всячески увеличивать территорию своей деятельности. \nПредставители этого числа сознания обладают тонкой аурой, поэтому обидеть их не составит труда, а в негативном состоянии такие люди склонны проявлять жесткость");
        } if(numcon == 6 || numcon == 15 || numcon == 24) {
            System.out.println("Обладатели числа сознания 6, т.е. рожденные 6, 15 и 24 числа, стремятся к комфорту и \nлюбви, при этом, чтобы добиться наибольшего успеха, им не нужно перегружать себя работой, а, напротив, необходимо \nбольше времени уделять отдыху. Эти люди легче остальных привлекают \nв свою жизнь материальные ценности и успешны в творческой сфере деятельности. Они живут эмоциями, а не разумом, а постоянное стремление к \nкомфортной жизни, полной наслаждений, может привести к злоупотреблению алкоголем");
        } if(numcon == 7 || numcon == 16 || numcon == 25) {
            System.out.println("кто родился 7, 16 и 25 числа любого месяца (число сознания 7). Эти люди обладают сильной \nэнергией и даже гениальностью, но только в том случае, если будут придерживаться жесткой дисциплины, в этом им \nпомогают занятия спортом и духовные практики. Это лидеры, им важно постоянно получать признание.\n Представители числа 7 очень работоспособны, выносливы, сохраняют хорошую физическую форму долгие годы. \nВ негативном состоянии они создают вокруг себя хаос, кризисные ситуации, что приводит их к серьезному энергетическому истощению");
        } if (numcon == 8 || numcon == 17 || numcon == 26) {
            System.out.println("Представители числа сознания 8 реалистичны и редко выражают свои эмоции. \nОни реализуют себя через труд и призывают к труду окружающих. Такие люди не нуждаются в ком-либо, они самодостаточны. \nОбладатели восьмерок созданы для контроля, но постоянный трудоголизм и стремление решать все за всех часто приводит к раннему инсульту. \nВ негативном состоянии проявляют излишнюю привязанность к материальному миру. \nЧтобы выйти из отрицательной энергии, таким людям нужно уйти от контроля и научиться служить другим");
        } if (numcon == 9 || numcon == 18 || numcon == 27) {
            System.out.println("Люди, рожденные 9, 18 или 27 числа (число сознания 9), легко идут на авантюру, любят экстрим и спорт. \nИм постоянно нужна идея, они могут браться за несколько дел одновременно и при этом не доводить их до конца. \nИм свойственна эмоциональность, вспыльчивость и спонтанное принятие решений. «Девятки» не любят проигрывать, любой промах их разрушает, \nи в негативном состоянии они способны выбрать для себя криминальный путь. \nСчитается, что идеальный союз в этом случае возможен между двумя «девятками», а вот \nс обладателями единицы лучше совместных планов не строить, т.к. им трудно найти общий язык");
        }
    }
    }

