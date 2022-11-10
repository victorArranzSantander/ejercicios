import pytest
from fibonacci import fibonacci


@pytest.mark.parametrize(
    "input_a,expected",
    [
        (1, 1),
        (2, 2),
        (6, 13)
    ]
)

def test_fibonaccis(input_a, expected):
    assert fibonacci(input_a) == expected