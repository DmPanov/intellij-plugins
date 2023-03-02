main() {
  final (a as A || b? && c! || == d && != e << f >>> g >> h & i ^ j | k-- + ~l++ - !m * +n / -o % ++p ~/ --r ) = null;

  @foo() final (lat, long) = geoCode('Aarhus');
  final ((a, b) && record) = (1, 2); // Parentheses.
  var [a, b] = [1, 2]; // List.
  var {1: a, 2: b} = {1: 2}; // Map.
  var (a, b, x: x) = (1, 2, x: 3); // Record.
  var Point(x: x, y: y) = Point(1, 2); // Object.

  for (@foo final (lat, long) in bar) {}
  for (@foo final ((a, b) && record) in bar) {}
  for (@foo var [a, b] in bar) {}
  for (var [a, b] in bar) {}
  for (var {1: a} in bar) {}
  for (var (a, b, x: x) in bar) {}
  for (var Point.a(x: x, y: y) in bar) {}

  (notFinal, unassignedFinal, lateFinal) = ('a', 'b', 'c');
  ((a, b) && record) = 1;
  (a && a) = 2;
  [a, b] = [a, b];
  {1: a, 2: b} = {1: 2};
  Point(x: x, y: y) = Point(1, 2);
}