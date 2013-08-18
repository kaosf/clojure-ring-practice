# hello-world

A Clojure library designed to ... well, that part is up to you.

## Usage

```sh
# git clone <this repository URL> hello-world
cd hello-world
lein repl
```

```clojure
(use 'ring.adapter.jetty)
(use 'hello-world.core)
(run-jetty handler {:port 3000})
```

## References

* https://github.com/ring-clojure/ring/wiki/Getting-Started

## License

[MIT](http://opensource.org/licenses/MIT)
