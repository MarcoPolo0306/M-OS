local w,h = term.getSize()
local nextVer = "4"

function printCentered(msg, height)
term.setCursorPos(w/2 - #msg/2, height)
term.write(msg)
end
function printWrappedRight(msg, height)
term.setCursorPos(w - #msg, height)
term.write(msg)
end

term.setCursorPos(1,1)
term.setBackgroundColor(colors.black)
term.setTextColor(colors.white)
term.clear()

local w,h = term.getSize()

function printCentered(msg, height)
  term.setCursorPos(w/2 - #msg/2, height)
  term.write(msg)
end

function drawMenu1()
  term.setBackgroundColor(colors.black)
  term.clear()
  printCentered("Updates were found!",1)
  printCentered("Would you like to update?",2)
  term.setBackgroundColor(colors.gray)
  printCentered(" > Yes < ",5)
  term.setBackgroundColor(colors.black)
  printCentered(" No ",6)
end

function drawMenu2()
  term.setBackgroundColor(colors.black)
  term.clear()
  printCentered("Updates were found!",1)
  printCentered("Would you like to update?",2)
  term.setBackgroundColor(colors.black)
  printCentered(" Yes ",5)
  term.setBackgroundColor(colors.gray)
  printCentered(" > No < ",6)
end

drawMenu1()

selection = 1

term.setTextColor(colors.white)
term.setBackgroundColor(colors.lightGray)
term.clear()
term.setTextColor(colors.white)
term.setCursorPos(1,1)
print("(C) 2016, 2017 MarcoSoft")
term.setCursorPos(w-4,1)
print("1.1.5")

term.setCursorPos(1,1)
print("(C) 2016, 2017 MarcoSoft")
term.setCursorPos(w-4,1)
print("1.1.4")
local logo = paintutils.loadImage("m-os/images/logo")
paintutils.drawImage(logo,w/2-6,h/2-4)
term.setBackgroundColor(colors.lightGray)
printCentered("Loading..",h/2+5)
term.setBackgroundColor(colors.white)
term.setCursorPos(w / 2 - 19 / 2,h/2+3)
textutils.slowWrite("                   ",25)
shell.run("setup2")
