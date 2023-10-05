import kotlin.math.abs

//"*" - мимо, "#" - попал, "-" - пустая клетка, "&" - корабль, "+" - зона возле корабля
class Game() {
    class Player() {
        class Deck(coords: MutableList<String>, state: MutableList<Boolean>) {
            var cord = coords
            var st = state
            var alive = true
            fun printCoords() {
                for (i in cord) {
                    print("$i  ")
                }
            }
        }

        var init_field: Array<Array<String>> = Array(10, {Array(10, {"-"})})
        var game_field: Array<Array<String>> = Array(10, {Array(10, {"-"})})

        var decks = mutableListOf<Deck>()
        var loose = false
        var onhit = false
    }

    var player1 = Player()
    var player2 = Player()

    val let = "abcdefghij"
    val num = "0123456789"

    fun printInitField(player: Player) {
        for (i in player.init_field) {
            for (j in i) {
                print("$j  ")
            }
            print(let[player.init_field.indexOf(i)])
            println()
        }
        for (i in num) {
            print("$i  ")
        }
        println()
    }

    fun printGameField(player: Player) {
        for (i in player.game_field) {
            for (j in i) {
                print("$j  ")
            }
            print(let[player.game_field.indexOf(i)])
            println()
        }
        for (i in num) {
            print("$i  ")
        }
        println()
    }

    fun place4deck(player: Player) {
        val tempcoord = mutableListOf<String>()
        val tempstate = mutableListOf<Boolean>()
        var correct = false
        while (!correct) {
            println("Введите координаты начала корабля")
            var firstcoords = readln()
            var fcl = let.indexOf(firstcoords[0])
            var fcn = num.indexOf(firstcoords[1])
            println("Введите координаты конца корабля")
            var secondcoords = readln()
            var scl = let.indexOf(secondcoords[0])
            var scn = num.indexOf(secondcoords[1])

            var started = 0
            var ended = 0

            if (player.init_field[fcl][fcn] == "-" && player.init_field[scl][scn] == "-") {
                if (fcl == scl) {
                    if (abs(fcn - scn) == 3) {

                        if (fcn < scn) {
                            started = fcn
                            ended = scn
                        } else {
                            started = scn
                            ended = fcn
                        }
                        for (i in fcl-1..scl+1) {
                            if (i >= 0 && i <= 9) {
                                for (j in started-1..ended+1) {
                                    if (j >= 0 && j <= 9) {
                                        if (i == fcl && j >= started && j <= ended) {
                                            player.init_field[i][j] = "&"
                                            val temp = let[i].toString() + num[j].toString()
                                            tempcoord.add(temp)
                                            tempstate.add(true)
                                        } else {
                                            player.init_field[i][j] = "+"
                                        }
                                    }
                                }
                            }
                        }
                        correct = true
                    }
                } else if (fcn == scn) {
                    if (abs(fcl - scl) == 3) {
                        if (fcl < scl) {
                            started = fcl
                            ended = scl
                        } else {
                            started = scl
                            ended = fcl
                        }
                        for (i in fcn-1..scn+1) {
                            if (i >= 0 && i <= 9) {
                                for (j in started-1..ended+1) {
                                    if (j >= 0 && j <= 9) {
                                        if (i == fcn && j >= started && j <= ended) {
                                            player.init_field[j][i] = "&"
                                            val temp = let[j].toString() + num[i].toString()
                                            tempcoord.add(temp)
                                            tempstate.add(true)
                                        } else {
                                            player.init_field[j][i] = "+"
                                        }
                                    }
                                }
                            }
                        }
                        correct = true
                    }
                }
            }

            if (!correct) {
                println("Ошибка! Повторите ввод!")
                //давай по новой миша всё хня
            }
        }
        player.decks.add(Player.Deck(tempcoord, tempstate))
    }

    fun place3deck(player: Player) {
        val tempcoord = mutableListOf<String>()
        val tempstate = mutableListOf<Boolean>()
        var correct = false
        while (!correct) {
            println("Введите координаты начала корабля")
            var firstcoords = readln()
            var fcl = let.indexOf(firstcoords[0])
            var fcn = num.indexOf(firstcoords[1])
            println("Введите координаты конца корабля")
            var secondcoords = readln()
            var scl = let.indexOf(secondcoords[0])
            var scn = num.indexOf(secondcoords[1])

            var started = 0
            var ended = 0

            if (player.init_field[fcl][fcn] == "-" && player.init_field[scl][scn] == "-") {
                if (fcl == scl) {
                    if (abs(fcn - scn) == 2) {

                        if (fcn < scn) {
                            started = fcn
                            ended = scn
                        } else {
                            started = scn
                            ended = fcn
                        }
                        for (i in fcl-1..scl+1) {
                            if (i >= 0 && i <= 9) {
                                for (j in started-1..ended+1) {
                                    if (j >= 0 && j <= 9) {
                                        if (i == fcl && j >= started && j <= ended) {
                                            player.init_field[i][j] = "&"
                                            val temp = let[i].toString() + num[j].toString()
                                            tempcoord.add(temp)
                                            tempstate.add(true)
                                        } else {
                                            player.init_field[i][j] = "+"
                                        }
                                    }
                                }
                            }
                        }
                        correct = true
                    }
                } else if (fcn == scn) {
                    if (abs(fcl - scl) == 2) {
                        if (fcl < scl) {
                            started = fcl
                            ended = scl
                        } else {
                            started = scl
                            ended = fcl
                        }
                        for (i in fcn-1..scn+1) {
                            if (i >= 0 && i <= 9) {
                                for (j in started-1..ended+1) {
                                    if (j >= 0 && j <= 9) {
                                        if (i == fcn && j >= started && j <= ended) {
                                            player.init_field[j][i] = "&"
                                            val temp = let[j].toString() + num[i].toString()
                                            tempcoord.add(temp)
                                            tempstate.add(true)
                                        } else {
                                            player.init_field[j][i] = "+"
                                        }
                                    }
                                }
                            }
                        }
                        correct = true
                    }
                }
            }

            if (!correct) {
                println("Ошибка! Повторите ввод!")
                //давай по новой миша всё хня
            }
        }
        player.decks.add(Player.Deck(tempcoord, tempstate))
    }

    fun place2deck(player: Player) {
        val tempcoord = mutableListOf<String>()
        val tempstate = mutableListOf<Boolean>()
        var correct = false
        while (!correct) {
            println("Введите координаты начала корабля")
            var firstcoords = readln()
            var fcl = let.indexOf(firstcoords[0])
            var fcn = num.indexOf(firstcoords[1])
            println("Введите координаты конца корабля")
            var secondcoords = readln()
            var scl = let.indexOf(secondcoords[0])
            var scn = num.indexOf(secondcoords[1])

            var started = 0
            var ended = 0

            if (player.init_field[fcl][fcn] == "-" && player.init_field[scl][scn] == "-") {
                if (fcl == scl) {
                    if (abs(fcn - scn) == 1) {

                        if (fcn < scn) {
                            started = fcn
                            ended = scn
                        } else {
                            started = scn
                            ended = fcn
                        }
                        for (i in fcl-1..scl+1) {
                            if (i >= 0 && i <= 9) {
                                for (j in started-1..ended+1) {
                                    if (j >= 0 && j <= 9) {
                                        if (i == fcl && j >= started && j <= ended) {
                                            player.init_field[i][j] = "&"
                                            val temp = let[i].toString() + num[j].toString()
                                            tempcoord.add(temp)
                                            tempstate.add(true)
                                        } else {
                                            player.init_field[i][j] = "+"
                                        }
                                    }
                                }
                            }
                        }
                        correct = true
                    }
                } else if (fcn == scn) {
                    if (abs(fcl - scl) == 1) {
                        if (fcl < scl) {
                            started = fcl
                            ended = scl
                        } else {
                            started = scl
                            ended = fcl
                        }
                        for (i in fcn-1..scn+1) {
                            if (i >= 0 && i <= 9) {
                                for (j in started-1..ended+1) {
                                    if (j >= 0 && j <= 9) {
                                        if (i == fcn && j >= started && j <= ended) {
                                            player.init_field[j][i] = "&"
                                            val temp = let[j].toString() + num[i].toString()
                                            tempcoord.add(temp)
                                            tempstate.add(true)
                                        } else {
                                            player.init_field[j][i] = "+"
                                        }
                                    }
                                }
                            }
                        }
                        correct = true
                    }
                }
            }

            if (!correct) {
                println("Ошибка! Повторите ввод!")
                //давай по новой миша всё хня
            }
        }
        player.decks.add(Player.Deck(tempcoord, tempstate))
    }

    fun place1deck(player: Player) {
        val tempcoord = mutableListOf<String>()
        val tempstate = mutableListOf<Boolean>()
        var correct = false
        while (!correct) {
            println("Введите координаты корабля")
            var firstcoords = readln()
            var fcl = let.indexOf(firstcoords[0])
            var fcn = num.indexOf(firstcoords[1])

            if (player.init_field[fcl][fcn] == "-") {
                for (i in fcl-1..fcl+1) {
                    if (i >= 0 && i <= 9) {
                        for (j in fcn-1..fcn+1) {
                            if (j >= 0 && j <= 9) {
                                if (i == fcl && j == fcn) {
                                    player.init_field[i][j] = "&"
                                    val temp = let[i].toString() + num[j].toString()
                                    tempcoord.add(temp)
                                    tempstate.add(true)
                                } else {
                                    player.init_field[i][j] = "+"
                                }
                            }
                        }
                    }
                }
                correct = true
            }

            if (!correct) {
                println("Ошибка! Повторите ввод!")
                //давай по новой миша всё хня
            }
        }
        player.decks.add(Player.Deck(tempcoord, tempstate))
    }

    fun shoot(player: Player) {
        println("Введите координаты выстрела")
        var coord = readln()
        var cl = let.indexOf(coord[0])
        var cn = num.indexOf(coord[1])
        if (player.game_field[cl][cn] == "-") {
            if (player.init_field[cl][cn] == "&") {
                player.onhit = true
                player.game_field[cl][cn] = "#"
                var almostalive = false
                for (deck in player.decks) {
                    for (coords in deck.cord) {
                        if (coords == coord) {
                            deck.st[deck.cord.indexOf(coord)] = false
                            var tempkill = false
                            for (k in deck.st) {
                                if (k) tempkill = true
                            }
                            if (!tempkill) {
                                deck.alive = false

                                var fcl = let.indexOf(deck.cord[0][0])
                                var fcn = num.indexOf(deck.cord[0][1])

                                var scl = let.indexOf(deck.cord.last()[0])
                                var scn = num.indexOf(deck.cord.last()[1])

                                for (i in fcl-1..scl+1) {
                                    if (i >= 0 && i <= 9) {
                                        for (j in fcn-1..scn+1) {
                                            if (j >= 0 && j <= 9) {
                                                if (player.game_field[i][j] != "#") {
                                                    player.game_field[i][j] = "*"
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (deck.alive) {
                                println("Ранил!")
                                almostalive = true
                            } else println("Убил!")
                        }
                    }
                }

                if (!almostalive) {
                    player.loose = true
                    player.onhit = false
                    return
                }
            } else {
                println("Мимо!")
                player.game_field[cl][cn] = "*"
                player.onhit = false
            }
        } else {
            println("Выстрел в данную точку был совершён, повторите ход!")
        }
    }

    fun hz() {
        printInitField(player1)
    }

    fun hz2() {
        place4deck(player1)
    }

    fun gameProcess() {
        println("Добро пожаловать в игру Морской ♂Boy♂.\n")//хаю хай
        println("Правила игры: \nИгроки по очереди расставляют корабли на своё поле.")
        println("Для того, чтобы расположить корабль, нужно задать координаты начала и конца корабля. \nНапример, a0 a3 для четырёхпалубного корабля.")
        println("Расстановка происходит без возможности перестановки, будьте внимательны!")
        println("Также, если при расстановке возникает недопустимый вариант, предлагается задать новые координаты начала и конца.")
        println("После расстановки кораблей обоими игроками, начинается основная часть игры Морской ♂Boy♂")
        println("Игроки по очереди указывают координаты точки, по которой производят удар, \nВ случае удачного выстрела, ход игрока продолжается.")
        println("Игра продолжается до тех пор, пока один из игроков не уничтожит корабли противника!")
        println("\nДля начала игры нажмите enter")

        readln()

        print("Очередь первого игрока (нажмите enter)")
        readln()

        printInitField(player1)
        println("\nРазместите четырехпалубный корабль")
        place4deck(player1)

        printInitField(player1)
        println("\nРазместите первый трехпалубный корабль")
        place3deck(player1)

        printInitField(player1)
        println("\nРазместите второй трехпалубный корабль")
        place3deck(player1)

        printInitField(player1)
        println("\nРазместите первый двухпалубный корабль")
        place2deck(player1)

        printInitField(player1)
        println("\nРазместите второй двухпалубный корабль")
        place2deck(player1)

        printInitField(player1)
        println("\nРазместите третий двухпалубный корабль")
        place2deck(player1)

        printInitField(player1)
        println("\nРазместите первый однопалубный корабль")
        place1deck(player1)

        printInitField(player1)
        println("\nРазместите второй однопалубный корабль")
        place1deck(player1)

        printInitField(player1)
        println("\nРазместите третий однопалубный корабль")
        place1deck(player1)

        printInitField(player1)
        println("\nРазместите четвёртый однопалубный корабль")
        place1deck(player1)

        println("Ваша итоговая расстановка кораблей")
        printInitField(player1)
        println("Нажмите enter для передачи хода")

        readln()
        println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n")

        print("Очередь второго игрока (нажмите enter)")
        readln()

        printInitField(player2)
        println("\nРазместите четырехпалубный корабль")
        place4deck(player2)

        printInitField(player2)
        println("\nРазместите первый трехпалубный корабль")
        place3deck(player2)

        printInitField(player2)
        println("\nРазместите второй трехпалубный корабль")
        place3deck(player2)

        printInitField(player2)
        println("\nРазместите первый двухпалубный корабль")
        place2deck(player2)

        printInitField(player2)
        println("\nРазместите второй двухпалубный корабль")
        place2deck(player2)

        printInitField(player2)
        println("\nРазместите третий двухпалубный корабль")
        place2deck(player2)

        printInitField(player2)
        println("\nРазместите первый однопалубный корабль")
        place1deck(player2)

        printInitField(player2)
        println("\nРазместите второй однопалубный корабль")
        place1deck(player2)

        printInitField(player2)
        println("\nРазместите третий однопалубный корабль")
        place1deck(player2)

        printInitField(player2)
        println("\nРазместите четвёртый однопалубный корабль")
        place1deck(player2)

        println("Ваша итоговая расстановка кораблей")
        printInitField(player2)
        println("Нажмите enter для начала игры")

        readln()
        println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n")

        while (!player1.loose && !player2.loose) {
            println("Ход первого игрока")
            player2.onhit = true
            while (player2.onhit) {
                printGameField(player2)
                shoot(player2)
            }
            printGameField(player2)
            if (player2.loose) {
                println("Победа первого игрока")
                break
            }
            print("Передача хода (нажмите enter)")
            readln()

            println("Ход второго игрока")
            player1.onhit = true
            while (player1.onhit) {
                printGameField(player1)
                shoot(player1)
            }
            printGameField(player1)
            if (player1.loose) {
                println("Победа второго игрока")
                break
            }
            print("Передача хода (нажмите enter)")
            readln()
        }
    }
}

fun main() {
    val game = Game()
    game.gameProcess()
}